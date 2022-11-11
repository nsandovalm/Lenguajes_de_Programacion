%******************EJERCICIO 3****************************
aplanar([],[]).
aplanar([A|B],C):-aplanar(A,X),aplanar(B,Y),append(X,Y,C).
aplanar(A,[A]).

%RESULTADOS--------------------------------------------------
%?- aplanar([1,2,[3,[4,5],[6,7]]],Lista).
%Lista = [1, 2, 3, 4, 5, 6, 7] .
