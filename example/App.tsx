import React, { useState } from 'react';
import { View, Image, Text, StyleSheet, Button } from 'react-native';
import Gallery from './Gallery';

const App = () => {
  const [index, setIndex] = useState(0);
  return (
    <>
      <Gallery index={index} style={{flex: 1}}>
        <View style={styles.painting}>
          <Image source={require('./rembrandt.jpeg')} style={styles.picture} />
          <Text style={styles.description}>
            Self-Portrait with Two Circles is an oil-on-canvas painting by the Dutch artist Rembrandt, painted c. 1665-1669, one of over 40 painted self-portraits by Rembrandt. In the portrait, Rembrandt holds his palette, brushes, and maulstick. The painting is notable for its monumentality and the enigmatic background consisting of a shallow space with the fragments of two circles.
          </Text>
        </View>
        <View style={styles.painting}>
          <Image source={require('./vermeer.jpeg')} style={styles.picture} />
          <Text style={styles.description}>
            Girl With A Pearl Earring is an oil painting by Dutch Golden Age painter Johannes Vermeer, dated c. 1665. Going by various names over the centuries, it became known by its present title towards the end of the 20th century after the earring worn by the girl portrayed there. The work has been in the collection of the Mauritshuis in The Hague since 1902 and has been the subject of various literary and cinematic treatments.
          </Text>
        </View>
      </Gallery>
      <View style={{flexDirection: 'row', justifyContent: 'center', paddingBottom: 10}}>
        <Button title='1' onPress={() => setIndex(0)} />
        <Button title='2' onPress={() => setIndex(1)} />
      </View>
    </>
  )
};

export default App;

const styles = StyleSheet.create({
  painting: {
    position: 'absolute',
    top: 0,
    left: 0,
    right: 0,
    bottom: 0,
    justifyContent: 'center',
    alignItems: 'center'
  },
  picture: {
    width: 200,
    height: 200
  },
  description: {
    padding: 10,
  }
});

