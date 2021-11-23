# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "pr2_motor_diagnostic_tool"
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Rahul Udasi"
HOMEPAGE = "http://ros.org/wiki/pr2_motor_diagnostic_tool"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_self_test"
ROS_BPN = "pr2_motor_diagnostic_tool"

ROS_BUILD_DEPENDS = " \
    ethercat-hardware \
    pluginlib \
    pr2-controller-interface \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    rospy \
    rqt-gui \
    rqt-gui-py \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ethercat-hardware \
    pluginlib \
    pr2-controller-interface \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    rospy \
    rqt-gui \
    rqt-gui-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ethercat-hardware \
    pluginlib \
    pr2-controller-interface \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    rospy \
    rqt-gui \
    rqt-gui-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_self_test-release/archive/release/melodic/pr2_motor_diagnostic_tool/1.0.15-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_motor_diagnostic_tool"
SRC_URI = "git://github.com/pr2-gbp/pr2_self_test-release;${ROS_BRANCH};protocol=https"
SRCREV = "93131ed06f18cb04b402aa85a1ddef1528561935"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
