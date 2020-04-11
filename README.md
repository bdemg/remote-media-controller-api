#Remote Media Controller Server
Hello, welcome to the remote-media-controller-api repo. Here lies a relatively simple api used to remotely control certain media functions of your Windows or Linux PC.

Currently the remote media controller server has the the following functionality:

* Increase, decrease and mute the volume on the host PC.
* Play, pause and change tracks on the players that interface with media keys (like Spotify and VLC).
* Play, pause and seek through video by emulating the spacebar and arrow keys.

This server was originally created to interface with the [remote-media-controller-app](https://github.com/bdemg/remote-media-controller-app) which you can download and install form [here]().

###Downloads and usage
First make sure that you have [Java](https://java.com/en/download/help/download_options.xml) installed. After that go to the [releases](https://github.com/bdemg/remote-media-controller-api/releases) page of this repo and choose the version that fits your OS:
####Windows
For windows you just have to unzip double click the `server-start.bat`
####Linux
For linux you'll have to make sure that you have python and amixer installed. Once you checked/downloaded those you'll have to unzip your download of the remote media server and enter `./server-start.sh` on a terminal. 

###Credits and thanks
The remote media controller server uses files and bits of code from other great developers that I want acknowledge:
* The windows version uses the parts of the [java-media-keys](https://github.com/nsnave/java-media-keys) project by [Aidan Evans](https://github.com/nsnave)
* The linux version uses a *very slightly* modified version of the [pymprisr](https://bitbucket.org/whitelynx/pymprisr/src/default/) project by [David Bronke](https://bitbucket.org/%7Bc4e753d5-fec0-4210-a96a-0876ffd92a09%7D/)