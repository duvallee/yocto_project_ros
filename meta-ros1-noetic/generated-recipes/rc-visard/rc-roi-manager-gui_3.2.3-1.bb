# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The ros client for the region of interest manager of the itempick and boxpick modules"
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Carlos Xavier Garcia Briones <carlos.garcia@roboception.de>"
HOMEPAGE = "http://wiki.ros.org/rc_roi_manager_gui"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_visard"
ROS_BPN = "rc_roi_manager_gui"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    interactive-markers \
    rc-common-msgs \
    rc-pick-client \
    roscpp \
    shape-msgs \
    tf \
    visualization-msgs \
    wxwidgets \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    interactive-markers \
    rc-common-msgs \
    rc-pick-client \
    roscpp \
    shape-msgs \
    tf \
    visualization-msgs \
    wxwidgets \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    interactive-markers \
    message-runtime \
    rc-common-msgs \
    rc-pick-client \
    roscpp \
    shape-msgs \
    tf \
    visualization-msgs \
    wxwidgets \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_visard-release/archive/release/noetic/rc_roi_manager_gui/3.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rc_roi_manager_gui"
SRC_URI = "git://github.com/roboception-gbp/rc_visard-release;${ROS_BRANCH};protocol=https"
SRCREV = "9612df286662194d0c23d86a65507943aa81c5b0"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
