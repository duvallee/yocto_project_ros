# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS support for Ainstein radar sensors."
AUTHOR = "Nick Rotella <nick.rotella@ainstein.ai>"
ROS_AUTHOR = "Nick Rotella"
HOMEPAGE = "https://wiki.ros.org/ainstein_radar"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ainstein_radar"
ROS_BPN = "ainstein_radar"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ainstein-radar-drivers \
    ainstein-radar-filters \
    ainstein-radar-gazebo-plugins \
    ainstein-radar-msgs \
    ainstein-radar-rviz-plugins \
    ainstein-radar-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/AinsteinAI/ainstein_radar-release/archive/release/melodic/ainstein_radar/2.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ainstein_radar"
SRC_URI = "git://github.com/AinsteinAI/ainstein_radar-release;${ROS_BRANCH};protocol=https"
SRCREV = "1e1ba830a6307cde9a43600b87b58236f8ea5149"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
