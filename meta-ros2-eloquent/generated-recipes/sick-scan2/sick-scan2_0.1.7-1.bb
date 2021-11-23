# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "A ROS2 driver for the SICK TiM series of laser scanners.     This package is based on the sick_scan-Repository."
AUTHOR = "Michael Lehning <michael.lehning@lehning.de>"
ROS_AUTHOR = "Michael Lehning <michael.lehning@lehning.de>"
HOMEPAGE = "http://wiki.ros.org/sick_scan2"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "sick_scan2"
ROS_BPN = "sick_scan2"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-updater \
    rclcpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-updater \
    rclcpp \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-updater \
    rclcpp \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SICKAG/sick_scan2-release/archive/release/eloquent/sick_scan2/0.1.7-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/sick_scan2"
SRC_URI = "git://github.com/SICKAG/sick_scan2-release;${ROS_BRANCH};protocol=https"
SRCREV = "843acac398b6ba3bddbf23ca591cce29f25269ed"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
