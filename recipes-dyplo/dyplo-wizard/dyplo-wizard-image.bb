SUMMARY = "TOPIC DYPLO example image from wizard"

require recipes-core/images/my-image.bb

MACHINE_FPGA_BITSTREAM = "fpga-image-wizard"
BOARD_FPGA_PACKAGES = "kernel-module-dyplo"

MY_THINGS += "\
	dyplo-utils \
	"
