# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Reimplementation of the tf/transformations.py library for common Python spatial operations"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "tf_transformations"
ROS_BPN = "tf_transformations"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-numpy \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-numpy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-numpy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DLu/tf_transformations_release/archive/release/foxy/tf_transformations/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/tf_transformations"
SRC_URI = "git://github.com/DLu/tf_transformations_release;${ROS_BRANCH};protocol=https"
SRCREV = "b5c1537173d53828ae357f47fd4f1618adcde241"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
