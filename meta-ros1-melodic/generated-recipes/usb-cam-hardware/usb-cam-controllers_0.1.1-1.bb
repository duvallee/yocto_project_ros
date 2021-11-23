# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The usb_cam_controllers package"
AUTHOR = "Yoshito Okada <yoshito@todo.todo>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "usb_cam_hardware"
ROS_BPN = "usb_cam_controllers"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    controller-interface \
    controller-manager \
    cv-bridge \
    image-transport \
    pluginlib \
    roscpp \
    sensor-msgs \
    usb-cam-hardware-interface \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    controller-interface \
    controller-manager \
    cv-bridge \
    image-transport \
    pluginlib \
    roscpp \
    sensor-msgs \
    usb-cam-hardware-interface \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    controller-interface \
    controller-manager \
    cv-bridge \
    image-transport \
    pluginlib \
    roscpp \
    sensor-msgs \
    usb-cam-hardware-interface \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yoshito-n-students/usb_cam_hardware-release/archive/release/melodic/usb_cam_controllers/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/usb_cam_controllers"
SRC_URI = "git://github.com/yoshito-n-students/usb_cam_hardware-release;${ROS_BRANCH};protocol=https"
SRCREV = "eeb9af571a522b08203aed1c00c84a566eb2c2b3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
