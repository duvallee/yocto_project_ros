# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The rc_hand_eye_calibration_client package"
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Christian Emmerich <christian.emmerich@roboception.de>"
HOMEPAGE = "http://wiki.ros.org/rc_hand_eye_calibration_client"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_visard"
ROS_BPN = "rc_hand_eye_calibration_client"

ROS_BUILD_DEPENDS = " \
    curl \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    message-runtime \
    rcdiscover \
    roscpp \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    message-runtime \
    rcdiscover \
    roscpp \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    message-runtime \
    rcdiscover \
    roscpp \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_visard-release/archive/release/noetic/rc_hand_eye_calibration_client/3.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rc_hand_eye_calibration_client"
SRC_URI = "git://github.com/roboception-gbp/rc_visard-release;${ROS_BRANCH};protocol=https"
SRCREV = "a945c6bd4148a72cc6627829b183b235299290c3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
