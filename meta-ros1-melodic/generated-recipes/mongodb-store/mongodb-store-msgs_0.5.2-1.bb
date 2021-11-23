# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The mongodb_store_msgs package"
AUTHOR = "Nick Hawes <nickh@robots.ox.ac.uk>"
ROS_AUTHOR = "Nick Hawes <nickh@robots.ox.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "mongodb_store"
ROS_BPN = "mongodb_store_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    catkin \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-generation \
    message-runtime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-generation \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_store_msgs/0.5.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mongodb_store_msgs"
SRC_URI = "git://github.com/strands-project-releases/mongodb_store;${ROS_BRANCH};protocol=https"
SRCREV = "9abd3d14d8b4892fd4f2749c80289f848b3ed1c5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
