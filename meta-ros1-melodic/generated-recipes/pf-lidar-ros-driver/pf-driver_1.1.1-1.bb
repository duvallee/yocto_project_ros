# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The Pepperl+Fuchs LiDAR package"
AUTHOR = "Harsh Deshpande <harshavardhan.deshpande@ipa.fraunhofer.de>"
ROS_AUTHOR = "Harsh Deshpande <harshavardhan.deshpande@ipa.fraunhofer.de>"
HOMEPAGE = "https://github.com/PepperlFuchs/pf_lidar_ros_driver"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=25515e36b34c800cf08bed6a88dd7900"

ROS_CN = "pf_lidar_ros_driver"
ROS_BPN = "pf_driver"

ROS_BUILD_DEPENDS = " \
    curlpp \
    dynamic-reconfigure \
    jsoncpp \
    laser-geometry \
    message-generation \
    pcl \
    pcl-conversions \
    pcl-ros \
    roscpp \
    roscpp-serialization \
    roslint \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curlpp \
    dynamic-reconfigure \
    jsoncpp \
    laser-geometry \
    pcl-conversions \
    pcl-ros \
    roscpp \
    roscpp-serialization \
    sensor-msgs \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curlpp \
    dynamic-reconfigure \
    jsoncpp \
    laser-geometry \
    message-runtime \
    pcl \
    pcl-conversions \
    pcl-ros \
    roscpp \
    roscpp-serialization \
    rviz \
    sensor-msgs \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PepperlFuchs/pf_lidar_ros_driver-release/archive/release/melodic/pf_driver/1.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pf_driver"
SRC_URI = "git://github.com/PepperlFuchs/pf_lidar_ros_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "bbb7ff3837566ecad9b5179cccbf61eafc77a110"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
