query:
    SELECT select-stmt ;

select-stmt:
    g1  g6  g25

g1:
    | g2

g2:
    WITH g3 g4

g3:
    | RECURSIVE

g4:
    common-table-expression g5

g5:
    | , common-table-expression g5

g6:
    g7 | g8

g7:
    SELECT g9 result-column g10 g11 g16 g17

g9:
    | DISTINCT | ALL

g10:
    | , result-column g10

g11:
    | g12

g12:
    FROM g13

g13:
    g14 | join-clause

g14:
    table-or-subquery g15

g15:
    | , table-or-subquery g15

g16:
    | WHERE expr

g17:
    | g18

g18:
    GROUP BY expr g20 g21

g20:
    | , expr g20

g21:
    | HAVING expr

g8:
    VALUES g22

g22:
    ( expr g23 ) g24

g23:
    | , expr g23

g24:
    | , ( expr g23 ) g24

g25:
    g26 | g27

g26:
    compound-operator g6

g27:
    g28 g30

g28:
    | ORDER BY ordering-term g29

g29:
    | , ordering-term g29

g30:
    | LIMIT expr g31

g31:
    | OFFSET expr | , expr

common-table-expr:
    table-name g32 AS ( select-stmt )

g32:
    | ( _field g33 )

g33:
    | , _field g33

compound-operator:
    UNION | UNION ALL | INTERSECT | EXCEPT

expr:
    FAKE-EXPR

join-clause:
    FAKE-JOIN-CLAUSE

ordering-term:
    FAKE-ORDERING-TERM

result-column:
    FAKE-RESULT-COLUMN

table-or-subquery:
    FAKE-TABLE-OR-SUBQUERY
