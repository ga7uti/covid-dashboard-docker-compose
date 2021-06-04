import { stringify } from '@angular/compiler/src/util';
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'numberSystem'
})
export class NumberSystemPipe implements PipeTransform {

  transform(value: String): String {
    var SI_SYMBOL = ["", "K", "M", "G", "T", "P", "E"];

    // what tier? (determines SI symbol)
    var tier = Math.log10(Math.abs(Number(value))) / 3 | 0;

    // if zero, we don't need a suffix
    if (tier == 0) return value;

    // get suffix and determine scale
    var suffix = SI_SYMBOL[tier];
    var scale = Math.pow(10, tier * 3);

    // scale the number
    var scaled = Number(value) / scale;

    // format number and add suffix
    return String(scaled.toFixed(1) + suffix);
  }

}
