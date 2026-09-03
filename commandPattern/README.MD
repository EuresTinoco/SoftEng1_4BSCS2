## Programming Challenge

Design a system that uses a special remote control to send commands to different devices. The key idea is to create a way for the remote control to control multiple devices without knowing the specifics of each device. Specifically:

Create a remote control that can send commands like "Power On" and "Power Off."

Implement separate commands for "Switch On" and "Switch Off."

Develop a system where devices (e.g., TV, stereo, lights) can respond to these commands. Each device should have its unique behavior for turning on and off.

Ensure that the remote control can send these commands to any device without knowing how each device works internally.

Your challenge is to apply a design pattern that allows this remote control to be flexible and extensible, enabling it to control various devices effortlessly. This should be achieved without the remote control having to understand the specific details of how each device operates.

## UML Diagram
![alt text](<Blank diagram.jpeg>)

## Components

* ViewerApp (Client): Represents the main application interface where the user makes decisions on which devices to control. It interacts with the RemoteControl to invoke commands dynamically.

* RemoteControl / Hub (Invoker):** Acts as the central invoker, receiving command requests and triggering them via the clickButton() method without needing internal knowledge of the targeted device.

* Command (Interface): Defines the common execution contract with the execute() method that all concrete commands implement.

* Concrete Commands: Objects such as PowerOn, PowerOff, TurnLightOn, IncreaseTemperature, PlayMusic, and DecreaseVolume that encapsulate a specific request and bind it to a receiver's action.

* Receivers (Devices): Smart home devices such as Tv, Light, Thermostat, and MusicPlayer that contain the actual device-specific logic for performing operations.