# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This rqt plugin ROS package provides easy view of .launch files.   User can also start and end node by node that are defined in those files."
AUTHOR = "Isaac Saito <130s@lateeye.net>"
ROS_AUTHOR = "Isaac Saito"
HOMEPAGE = "http://wiki.ros.org/rqt_launch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_launch"
ROS_BPN = "rqt_launch"

ROS_BUILD_DEPENDS = " \
    rqt-py-common \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    python-qt-binding \
    roslaunch \
    rospy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    roslaunch \
    rospy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rqt_launch-release/archive/release/melodic/rqt_launch/0.4.8-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rqt_launch"
SRC_URI = "git://github.com/ros-gbp/rqt_launch-release;${ROS_BRANCH};protocol=https"
SRCREV = "d5e1ddcaad9a68104c7a3a3b88945e0fb52212bd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
