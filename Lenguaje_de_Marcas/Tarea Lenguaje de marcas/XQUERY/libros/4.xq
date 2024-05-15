(: Obtener cuántos libros hay que no disponen de formato digital
almacenados en el XML. :)
let $doc := doc("libros.xml")
let $libros_papel := count($doc//libro[not(exists(elibro))])

return $libros_papel