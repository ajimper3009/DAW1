(: Marca y modelo de las impresoras que impriman de un tamaño diferente :)

for $impresora in doc("impresoras.xml")/impresoras/impresora
where count($impresora/tamanios/tamanio) > 1
return 
<impresora>
<marca>{$impresora/marca/text()}</marca>
<modelo>{$impresora/modelo/text()}</modelo>
</impresora>