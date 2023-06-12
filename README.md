# Images disappear during the exit transition of a Fragment
This repository contains an example app built with `npx react-native init`. There are no third party dependencies. It contains a native Android Gallery component that displays paintings. When you click the button number 2 the component replaces one Fragment with another Fragment. The previous painting should fade out as the new painting fades in.

## Steps to recreate the problem
1. cd to the `example` app
2. Run `npm install`
3. Run `npx react-native run-android`
4. Press the '2' button to change the painting
5. The image disappears instantly but it should fade out slowly like the text.
