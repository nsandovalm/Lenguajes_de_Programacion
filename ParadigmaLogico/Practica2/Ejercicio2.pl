%**************EJERCICIO 2************************
sub_conjunto([],_).
sub_conjunto([A|Y],Z):- member(A,Z), sub_conjunto(Y,Z).

%RESULTADOS--------------------
%?- sub_conjunto([],[1,2,3,4,5]).
%true.
%
%?- sub_conjunto([3,4,5],[1,2,3,4,5]).
%true .
%
%?- sub_conjunto([3,4,5,6],[1,2,3,4,5]).
%false.
