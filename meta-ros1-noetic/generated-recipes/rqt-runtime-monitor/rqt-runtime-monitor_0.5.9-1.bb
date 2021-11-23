# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "rqt_runtime_monitor provides a GUI plugin viewing DiagnosticsArray messages."
AUTHOR = "Aaron Blasdel <ablasdel@gmail.com>"
ROS_AUTHOR = "Aaron Blasdel"
HOMEPAGE = "http://wiki.ros.org/rqt_runtime_monitor"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_runtime_monitor"
ROS_BPN = "rqt_runtime_monitor"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    python-qt-binding \
    python3-rospkg \
    qt-gui \
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

# matches with: https://github.com/ros-gbp/rqt_runtime_monitor-release/archive/release/noetic/rqt_runtime_monitor/0.5.9-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rqt_runtime_monitor"
SRC_URI = "git://github.com/ros-gbp/rqt_runtime_monitor-release;${ROS_BRANCH};protocol=https"
SRCREV = "eebf29f88cfe3b63caad0dd53d283a9cf7dbf75f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
