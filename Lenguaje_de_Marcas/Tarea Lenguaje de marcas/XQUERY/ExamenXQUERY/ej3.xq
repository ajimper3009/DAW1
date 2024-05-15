(:
Obtener una etiqueta XML con la superficie promedio y la superficie total de los países europeos con separador de miles y 2 decimales. Indicando la unidad en un atributo
Ejemplo:
<superficie_total unidad="km2">1.345.944</superficie_total>
<superficie_media unidad="km2">407.117,33</superficie_media>
:)

let $doc := doc("geografia.xml")

let $superficieTotal := format-number(sum($doc//superficie),'#.000')

let $superficieMedia := format-number(avg($doc//superficie),'#.000')

return
<superficie>
<superfie_total unidad="2km">{$superficieTotal}</superfie_total>
<superfie_Media unidad="2km">{$superficieMedia}</superfie_Media>
</superficie>


