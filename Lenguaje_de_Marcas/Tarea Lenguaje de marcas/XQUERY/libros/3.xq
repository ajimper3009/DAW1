(: Mostrar la estructura de una tabla de HTML con la cantidad total de libros y
precio medio entre todos los libros. :)

let $doc := doc("libros.xml")
let $cantidad_total := count ($doc//libro)
let $precio_medio := avg($doc//libro/precio)

return
<table style="border: solid black 1px; border-collapse: collapse">
<tr>
    <th style="border: solid black 2px">Total de libros</th>
    <th style="border: solid black 2px">Promedio de precio</th>
</tr>
<tr>
    <th>{$cantidad_total}</th>
    <th>{$precio_medio}</th>
</tr>
</table>