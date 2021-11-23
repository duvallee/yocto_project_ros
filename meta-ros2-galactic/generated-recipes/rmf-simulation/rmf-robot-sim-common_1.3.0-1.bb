# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Common utility functions for Gazebo and ignition RMF plugins"
AUTHOR = "Luca Della Vedova <luca@openrobotics.org>"
ROS_AUTHOR = "Aaron Chong"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "rmf_simulation"
ROS_BPN = "rmf_robot_sim_common"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    rclcpp \
    rmf-building-map-msgs \
    rmf-dispenser-msgs \
    rmf-fleet-msgs \
    rmf-ingestor-msgs \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    rclcpp \
    rmf-building-map-msgs \
    rmf-dispenser-msgs \
    rmf-fleet-msgs \
    rmf-ingestor-msgs \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    rclcpp \
    rmf-building-map-msgs \
    rmf-dispenser-msgs \
    rmf-fleet-msgs \
    rmf-ingestor-msgs \
    std-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmf_simulation-release/archive/release/galactic/rmf_robot_sim_common/1.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/rmf_robot_sim_common"
SRC_URI = "git://github.com/ros2-gbp/rmf_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "c6a96ccbdac9176ead36fad84bb4cd65737fe955"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
