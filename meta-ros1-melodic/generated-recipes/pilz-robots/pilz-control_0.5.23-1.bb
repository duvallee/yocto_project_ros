# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides a specialized joint_trajectory_controller that can be moved into holding state via service call.   No further trajectories will be accepted/followed in this state."
AUTHOR = "Alexander Gutenkunst <a.gutenkunst@pilz.de>"
HOMEPAGE = "http://ros.org/wiki/pilz_control"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "pilz_robots"
ROS_BPN = "pilz_control"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    controller-interface \
    controller-manager \
    joint-trajectory-controller \
    moveit-core \
    moveit-ros-planning \
    pilz-msgs \
    roscpp \
    roslint \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    controller-manager \
    joint-trajectory-controller \
    moveit-core \
    moveit-ros-planning \
    pilz-msgs \
    roscpp \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    controller-manager \
    joint-trajectory-controller \
    moveit-core \
    moveit-ros-planning \
    pilz-msgs \
    roscpp \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    code-coverage \
    geometry-msgs \
    pilz-testutils \
    pilz-utils \
    rostest \
    rosunit \
    tf2 \
    tf2-geometry-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/pilz_control/0.5.23-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pilz_control"
SRC_URI = "git://github.com/PilzDE/pilz_robots-release;${ROS_BRANCH};protocol=https"
SRCREV = "fb814a238c89b128e2692f26eb550e92c93abde3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
