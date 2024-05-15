(: Obtener las categorías de libros que hayan tenido alguna oferta. :)

let $doc := doc("libros.xml")

for $libro in $doc//libro
let $oferta := $doc//oferta[reflibro/text() = $libro/titulo/text()]
return
<libro>
  <categoria>{$libro/@categoria}</categoria>
</libro>