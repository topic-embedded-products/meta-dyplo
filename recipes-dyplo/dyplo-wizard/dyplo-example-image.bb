DESCRIPTION = "TOPIC DYPLO example image"

require recipes-core/images/my-image.bb
 
MY_THINGS = "\
  dyplo-utils \
  dyplo-eeprom-license \
  dyplo-example-app \
  kernel-module-dyplo \
"
