# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Launch files to use Moose in Gazebo."
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moose_simulator"
ROS_BPN = "moose_gazebo"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    gazebo-plugins \
    gazebo-ros \
    gazebo-ros-control \
    hector-gazebo-plugins \
    joint-state-publisher \
    moose-control \
    moose-description \
    robot-localization \
    robot-state-publisher \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/moose_simulator-release/archive/release/melodic/moose_gazebo/0.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moose_gazebo"
SRC_URI = "git://github.com/clearpath-gbp/moose_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "07ff9d7895d25655111586b5451ce2c160ff207a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
