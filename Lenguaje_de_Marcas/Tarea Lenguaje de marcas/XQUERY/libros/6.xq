(: Obtener el nodo completo de todos los libros con un precio entre 20 y 40,
ambos no incluidos, ordenados por el año de forma descendente. :)

let $doc := doc("libros.xml")

for $libro in $doc//libro

where number($libro/precio/text()) > 20 and number($libro/precio/text() < 40)
order by $libro/anio descending
return $libro