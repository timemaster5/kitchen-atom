FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

DESCRIPTION = "b43 firmware files"
LICENSE = "CLOSED"

SRC_URI += "file://b43-firmware-${PV}.tar.gz"

FW_DST = "/lib/firmware/b43"

FILES_${PN} += "${FW_DST}/*"

do_install_append () {
   install -d ${D}${FW_DST}
   install -m 0644 ${S}/* ${D}${FW_DST}
}
