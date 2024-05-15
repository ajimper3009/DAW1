(: Extra 1. Obtener los titulos y precios de los libros que esten en la oferta actualmente :)

let $doc := doc("libros.xml")
let $hoy := current-date()
let $ofertas :=
for $oferta in $doc//oferta
where
$hoy >= $oferta/fecha_inicio and $hoy <= $oferta/fecha_fin
return $oferta
for $libro in $doc//libro
where $libro/titulo/text() = $ofertas/reflibro and $libro/titulo[@idioma = "es"]
return $libro/titulo/text()