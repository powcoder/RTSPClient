https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
/*
 * Author: Jonatan Schroeder
 * Updated: March 2022
 *
 * This code may not be used without written consent of the authors.
 */

package ca.yorku.rtsp.client.model;

import ca.yorku.rtsp.client.exception.RTSPException;

public interface SessionListener {

    public void exceptionThrown(RTSPException exception);

    public void frameReceived(Frame frame);

    public void videoEnded();

    public void videoNameChanged(String videoName);
}
