require recipes-extended/images/container-app-base.bb

CONTAINER_APP = " \
	packagegroup-core-base-utils \
	vpk120-base-noc-perf \
	perf \
	util-linux-dmesg \
	"

CONTAINER_APP_CMD = "sh -c 'mkdir -p /sys/kernel/config/device-tree/overlays/vpk120-base-noc-perf 2>/dev/null; cat /lib/firmware/xilinx/vpk120-base-noc-perf/vpk120-base-noc-perf.dtbo > /sys/kernel/config/device-tree/overlays/vpk120-base-noc-perf/dtbo 2>/dev/null; exec bash'"

COMPATIBLE_MACHINE:amd-cortexa72-common = "${MACHINE}"

CONTAINER_SHELL = "bash"
