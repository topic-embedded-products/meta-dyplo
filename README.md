meta-dyplo
==========

OpenEmbedded/Yocto overlay adding Dyplo driver, library and utilities

To add this layer to your OE environment, clone this repository into your layers directory and add it to the BBLAYERS variable in build/conf/bblayers.conf. It should have a BBLAYERS that looks like this:

````
BBLAYERS = " \
  ...
  Existing BBLAYER paths
  ...
  ${LAYERTOPDIR}/meta-dyplo \
  "
````

