%**********Ejercicio1************

evaluar([],_).
evaluar([CA|S1],[P|S2]) :-
    CA = P,
    evaluar(S1,S2).


subcadena(_,[],[]).
subcadena(SB,[L|C1],[L|F]) :-

     string_codes(SB,S1),
     string_codes(L,S2),
     evaluar(S1,S2),
     subcadena(SB,C1,F), !.

subcadena(SB,[_|C1],F) :-
     subcadena(SB,C1,F), !.

%Resultado:
%?- subcadena("cam",["camion","cama","casa"],Filtradas).
%Filtradas = ["camion", "cama"].
