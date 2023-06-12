import React from 'react';
import { requireNativeComponent } from "react-native";

const Gallery = (props: any) => {
  return <NativeGallery {...props} />;
};

const NativeGallery = requireNativeComponent('NativeGallery');

export default Gallery;
