# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package pulls in the Karto mapping library, and provides a ROS      wrapper for using it."
AUTHOR = "Michael Ferguson <mfergs7@gmail.com>"
ROS_AUTHOR = "Brian Gerkey"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

ROS_CN = "slam_karto"
ROS_BPN = "slam_karto"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    libeigen \
    message-filters \
    nav-msgs \
    open-karto \
    rosconsole \
    roscpp \
    sensor-msgs \
    sparse-bundle-adjustment \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    message-filters \
    nav-msgs \
    open-karto \
    rosconsole \
    roscpp \
    sensor-msgs \
    sparse-bundle-adjustment \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    message-filters \
    nav-msgs \
    open-karto \
    rosconsole \
    roscpp \
    sensor-msgs \
    sparse-bundle-adjustment \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/slam_karto-release/archive/release/melodic/slam_karto/0.8.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/slam_karto"
SRC_URI = "git://github.com/ros-gbp/slam_karto-release;${ROS_BRANCH};protocol=https"
SRCREV = "3befd4541a347599f54e2633343f5cd98b03a92e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
