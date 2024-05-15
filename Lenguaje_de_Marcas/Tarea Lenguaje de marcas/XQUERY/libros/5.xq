(: Obtener los títulos de los libros que disponen de formato digital. :)

let $doc := doc("libros.xml")

for $libro in $doc//libro
where exists($libro/elibro)
return
<libro_electronico>
{$libro/titulo/text()}
</libro_electronico>
