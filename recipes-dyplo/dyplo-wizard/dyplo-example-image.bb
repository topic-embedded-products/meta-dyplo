DESCRIPTION = "TOPIC Bricks DYPLO example image (no HDMI nor audio etc.)"

require recipes-core/images/my-image.bb

MACHINE_FPGA_BITSTREAM = "fpga-image-example"

MY_THINGS = "\
	dyplo-utils \
	dyplo-eeprom-license \
	dyplo-example-app \
	kernel-module-dyplo \
	"
