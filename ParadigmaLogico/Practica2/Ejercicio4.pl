%Ejercicio 4*************************************
%        a ---- c ---- x
%      /   \   /
%     /	    \ /
%   i        X
%     \     / \
%      \   /   \
%        b ---- d ---- f
%

conectado(i,a,3).
conectado(i,b,7).
conectado(a,i,10).
conectado(a,c,7).
conectado(a,d,9).
conectado(b,i,11).
conectado(b,c,5).
conectado(b,d,8).
conectado(c,a,12).
conectado(c,x,10).
conectado(c,b,2).
conectado(d,b,3).
conectado(d,a,1).
conectado(d,f,6).
conectado(x,c,3).
conectado(f,d,1).


ruta(Ini,Fin,Ruta,Peso):- ruta2(Ini,Fin,[],Ruta,Peso).

ruta2(Fin,Fin,_,[Fin],0).
ruta2(Ini,Fin,Visitados,[Ini|Resto],Peso):-

    conectado(Ini,Alguien,Peso2),
    not(member(Alguien,Visitados)),
    ruta2(Alguien,Fin,[Ini|Visitados],Resto,P),
    Peso is P + Peso2.

rutas(Ini,Fin,rutas):- findall([Ruta,Peso],ruta(Ini,Fin,Ruta,Peso),rutas).

rutacorta(Ini,Fin):-
    rutas(Ini,Fin,rutas),
    rutas(rutas,[],100,rutacorta,Peso),
    write('Ruta corta: '),
    write(rutacorta),
    nl,
    write('Peso de la ruta es: '),
    write(Peso).

