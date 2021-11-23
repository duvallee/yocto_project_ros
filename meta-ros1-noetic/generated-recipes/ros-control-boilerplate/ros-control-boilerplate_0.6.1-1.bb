# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Simple simulation interface and template for setting up a hardware interface for ros_control"
AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
ROS_AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
HOMEPAGE = "https://github.com/davetcoleman/ros_control_boilerplate"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_control_boilerplate"
ROS_BPN = "ros_control_boilerplate"

ROS_BUILD_DEPENDS = " \
    actionlib \
    cmake-modules \
    control-msgs \
    control-toolbox \
    controller-manager \
    gflags \
    hardware-interface \
    joint-limits-interface \
    roscpp \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    transmission-interface \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    control-msgs \
    control-toolbox \
    controller-manager \
    hardware-interface \
    joint-limits-interface \
    roscpp \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    transmission-interface \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    control-msgs \
    control-toolbox \
    controller-manager \
    hardware-interface \
    joint-limits-interface \
    roscpp \
    rosparam-shortcuts \
    sensor-msgs \
    std-msgs \
    trajectory-msgs \
    transmission-interface \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PickNikRobotics/ros_control_boilerplate-release/archive/release/noetic/ros_control_boilerplate/0.6.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ros_control_boilerplate"
SRC_URI = "git://github.com/PickNikRobotics/ros_control_boilerplate-release;${ROS_BRANCH};protocol=https"
SRCREV = "7a24688d1a3950afdcc6560153f46d6b87a43fbe"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
