(: Obtener el autor, año y precio de cada libro perteneciente a la categoría
COCINA que no esté agotado. :)

let $doc := doc("libros.xml")
for $libro in $doc//libro
where $libro/@categoria = "COCINA" and (not(exists($libro/@agotado))
or $libro/@agotado = "false")
return 
<libro>
<autor>{$libro/autor/text()}</autor>
<anio>{$libro/anio/text()}</anio>
<precio>{$libro/precio/text()}</precio>
</libro>