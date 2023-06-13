import Color from 'tinycolor2';

import StyleDictionary from 'style-dictionary';
import config from './style-dictionary-config.json' assert { type: 'json' };


const styleDictionary = StyleDictionary.extend(config);

styleDictionary.registerTransform({
    name: 'name/composeColorName',
    type: 'value',
    matcher: function(prop) {
       return prop.attributes.category === 'sofia';
    },
    transformer: function(prop) {
      const hex = Color(prop.value).toHex();
      return `Color(0xFF${hex})`;
    }
});

styleDictionary.buildAllPlatforms();



