# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ROS package containing examples for interfacing ROS with the standard ROS controller of Webots"
AUTHOR = "Cyberbotics <support@cyberbotics.com>"
ROS_AUTHOR = "Cyberbotics"
HOMEPAGE = "http://wiki.ros.org/webots_ros"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "webots_ros"
ROS_BPN = "webots_ros"

ROS_BUILD_DEPENDS = " \
    message-generation \
    moveit-ros-planning-interface \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    moveit-ros-planning-interface \
    robot-state-publisher \
    ros-control \
    ros-controllers \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    moveit-ros-planning-interface \
    robot-state-publisher \
    ros-control \
    ros-controllers \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/cyberbotics/webots_ros-release/archive/release/melodic/webots_ros/4.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/webots_ros"
SRC_URI = "git://github.com/cyberbotics/webots_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "62db342de94bc185fdd88b97667729304d883642"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
