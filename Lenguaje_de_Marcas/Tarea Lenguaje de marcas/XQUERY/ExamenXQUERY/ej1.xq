(:
Obtener todos los países que tienen el euro como moneda
:)

let $doc := doc("geografia.xml")

for $moneda in $doc//pais
where $moneda/moneda = "euro"

return
<moneda>{$moneda/@nombre}</moneda>