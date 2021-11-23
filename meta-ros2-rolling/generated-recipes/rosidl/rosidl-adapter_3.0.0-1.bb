# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "API and scripts to parse .msg/.srv/.action files and convert them to .idl."
AUTHOR = "Michel Hidalgo <michel@ekumenlabs.com>"
ROS_AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl"
ROS_BPN = "rosidl_adapter"

ROS_BUILD_DEPENDS = " \
    ament-cmake \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-core-native \
    python3-native \
"

ROS_EXEC_DEPENDS = " \
    python3-empy \
    rosidl-cli \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl-release/archive/release/rolling/rosidl_adapter/3.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/rosidl_adapter"
SRC_URI = "git://github.com/ros2-gbp/rosidl-release;${ROS_BRANCH};protocol=https"
SRCREV = "322c2e1c0182cf3d9f9727a8394fb737d2a2d181"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
