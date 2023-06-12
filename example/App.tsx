import React from 'react';
import { View, Image, Text } from 'react-native';
import Gallery from './Gallery';

const App = () => (
  <Gallery>
    <View>
      <Image source={require('./rembrandt.jpeg')} />
      <Text>
        Self-Portrait with Two Circles is an oil-on-canvas painting by the Dutch artist Rembrandt, painted c. 1665-1669, one of over 40 painted self-portraits by Rembrandt. In the portrait, Rembrandt holds his palette, brushes, and maulstick. The painting is notable for its monumentality and the enigmatic background consisting of a shallow space with the fragments of two circles.
      </Text>
    </View>
    <View>
      <Image source={require('./vermeer.jpeg')} />
      <Text>
        Girl With A Pearl Earring is an oil painting by Dutch Golden Age painter Johannes Vermeer, dated c. 1665. Going by various names over the centuries, it became known by its present title towards the end of the 20th century after the earring worn by the girl portrayed there. The work has been in the collection of the Mauritshuis in The Hague since 1902 and has been the subject of various literary and cinematic treatments.
      </Text>
    </View>
    </Gallery>
);

export default App;
