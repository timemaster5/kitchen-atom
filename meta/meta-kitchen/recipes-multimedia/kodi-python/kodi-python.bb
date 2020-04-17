SUMMARY = "Python modueles needed for my kodi setup"
DESCRIPTION = "Additional python modules"
LICENSE = "MIT"

#python do_build() {
#    bb.plain("***********************************************");
#    bb.plain("*                                             *");
#    bb.plain("*  Example recipe created by bitbake-layers   *");
#    bb.plain("*                                             *");
#    bb.plain("***********************************************");
#}


DEPENDS += "python3-pycrypto-native"
DEPENDS += "python3-pyelftools-native"
DEPENDS += "python3-pycryptodomex-native"
