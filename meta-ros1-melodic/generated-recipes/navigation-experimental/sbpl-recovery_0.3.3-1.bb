# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A recovery behavior that uses the sbpl lattice planner and the pose     follower to try to plan in full 3D to get the robot out of really tricky     situations."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://wiki.ros.org/sbpl_recovery"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_experimental"
ROS_BPN = "sbpl_recovery"

ROS_BUILD_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    nav-core \
    pluginlib \
    pose-follower \
    roscpp \
    sbpl-lattice-planner \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    nav-core \
    pluginlib \
    pose-follower \
    roscpp \
    sbpl-lattice-planner \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    base-local-planner \
    costmap-2d \
    nav-core \
    pluginlib \
    pose-follower \
    roscpp \
    sbpl-lattice-planner \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/sbpl_recovery/0.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/sbpl_recovery"
SRC_URI = "git://github.com/ros-gbp/navigation_experimental-release;${ROS_BRANCH};protocol=https"
SRCREV = "c6289fa0e6e30356bb617b3e95c871c18712d9f4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
