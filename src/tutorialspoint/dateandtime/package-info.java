/**
 * Contains some examples about Date & Time topic.
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../files/mystyle.css"> </head>
 * <p>
 * <table>
 * <caption>Simple DateFormat format codes</caption> <tbody>
 * <tr>
 * <th>Character</th>
 * <th>Description</th>
 * <th>Example</th>
 * </tr>
 * <tr>
 * <td>G</td>
 * <td>Era designator</td>
 * <td>AD</td>
 * </tr>
 * <tr>
 * <td>y</td>
 * <td>Year in four digits</td>
 * <td>2001</td>
 * </tr>
 * <tr>
 * <td>M</td>
 * <td>Month in year</td>
 * <td>July or 07</td>
 * </tr>
 * <tr>
 * <td>d</td>
 * <td>Day in month</td>
 * <td>10</td>
 * </tr>
 * <tr>
 * <td>h</td>
 * <td>Hour in A.M./P.M. (1~12)</td>
 * <td>12</td>
 * </tr>
 * <tr>
 * <td>H</td>
 * <td>Hour in day (0~23)</td>
 * <td>22</td>
 * </tr>
 * <tr>
 * <td>m</td>
 * <td>Minute in hour</td>
 * <td>30</td>
 * </tr>
 * <tr>
 * <td>s</td>
 * <td>Second in minute</td>
 * <td>55</td>
 * </tr>
 * <tr>
 * <td>S</td>
 * <td>Millisecond</td>
 * <td>234</td>
 * </tr>
 * <tr>
 * <td>E</td>
 * <td>Day in week</td>
 * <td>Tuesday</td>
 * </tr>
 * <tr>
 * <td>D</td>
 * <td>Day in year</td>
 * <td>360</td>
 * </tr>
 * <tr>
 * <td>F</td>
 * <td>Day of week in month</td>
 * <td>2 (second Wed. in July)</td>
 * </tr>
 * <tr>
 * <td>w</td>
 * <td>Week in year</td>
 * <td>40</td>
 * </tr>
 * <tr>
 * <td>W</td>
 * <td>Week in month</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>a</td>
 * <td>A.M./P.M. marker</td>
 * <td>PM</td>
 * </tr>
 * <tr>
 * <td>k</td>
 * <td>Hour in day (1~24)</td>
 * <td>24</td>
 * </tr>
 * <tr>
 * <td>K</td>
 * <td>Hour in A.M./P.M. (0~11)</td>
 * <td>10</td>
 * </tr>
 * <tr>
 * <td>z</td>
 * <td>Time zone</td>
 * <td>Eastern Standard Time</td>
 * </tr>
 * <tr>
 * <td>'</td>
 * <td>Escape for text</td>
 * <td>Delimiter</td>
 * </tr>
 * <tr>
 * <td>"</td>
 * <td>Single quote</td>
 * <td>`</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 *
 * <p>
 * <table>
 * <caption>Date and Time Conversion Characters</caption> <tbody>
 * <tr>
 * <th>Character</th>
 * <th>Description</th>
 * <th>Example</th>
 * </tr>
 * <tr>
 * <td>c</td>
 * <td>Complete date and time</td>
 * <td>Mon May 04 09:51:52 CDT 2009</td>
 * </tr>
 * <tr>
 * <td>F</td>
 * <td>ISO 8601 date</td>
 * <td>2004-02-09</td>
 * </tr>
 * <tr>
 * <td>D</td>
 * <td>U.S. formatted date (month/day/year)</td>
 * <td>02/09/2004</td>
 * </tr>
 * <tr>
 * <td>T</td>
 * <td>24-hour time</td>
 * <td>18:05:19</td>
 * </tr>
 * <tr>
 * <td>r</td>
 * <td>12-hour time</td>
 * <td>06:05:19 pm</td>
 * </tr>
 * <tr>
 * <td>R</td>
 * <td>24-hour time, no seconds</td>
 * <td>18:05</td>
 * </tr>
 * <tr>
 * <td>Y</td>
 * <td>Four-digit year (with leading zeroes)</td>
 * <td>2004</td>
 * </tr>
 * <tr>
 * <td>y</td>
 * <td>Last two digits of the year (with leading zeroes)</td>
 * <td>04</td>
 * </tr>
 * <tr>
 * <td>C</td>
 * <td>First two digits of the year (with leading zeroes)</td>
 * <td>20</td>
 * </tr>
 * <tr>
 * <td>B</td>
 * <td>Full month name</td>
 * <td>February</td>
 * </tr>
 * <tr>
 * <td>b</td>
 * <td>Abbreviated month name</td>
 * <td>Feb</td>
 * </tr>
 * <tr>
 * <td>m</td>
 * <td>Two-digit month (with leading zeroes)</td>
 * <td>02</td>
 * </tr>
 * <tr>
 * <td>d</td>
 * <td>Two-digit day (with leading zeroes)</td>
 * <td>03</td>
 * </tr>
 * <tr>
 * <td>e</td>
 * <td>Two-digit day (without leading zeroes)</td>
 * <td>9</td>
 * </tr>
 * <tr>
 * <td>A</td>
 * <td>Full weekday name</td>
 * <td>Monday</td>
 * </tr>
 * <tr>
 * <td>a</td>
 * <td>Abbreviated weekday name</td>
 * <td>Mon</td>
 * </tr>
 * <tr>
 * <td>j</td>
 * <td>Three-digit day of year (with leading zeroes)</td>
 * <td>069</td>
 * </tr>
 * <tr>
 * <td>H</td>
 * <td>Two-digit hour (with leading zeroes), between 00 and 23</td>
 * <td>18</td>
 * </tr>
 * <tr>
 * <td>k</td>
 * <td>Two-digit hour (without leading zeroes), between 0 and 23</td>
 * <td>18</td>
 * </tr>
 * <tr>
 * <td>I</td>
 * <td>Two-digit hour (with leading zeroes), between 01 and 12</td>
 * <td>06</td>
 * </tr>
 * <tr>
 * <td>l</td>
 * <td>Two-digit hour (without leading zeroes), between 1 and 12</td>
 * <td>6</td>
 * </tr>
 * <tr>
 * <td>M</td>
 * <td>Two-digit minutes (with leading zeroes)</td>
 * <td>05</td>
 * </tr>
 * <tr>
 * <td>S</td>
 * <td>Two-digit seconds (with leading zeroes)</td>
 * <td>19</td>
 * </tr>
 * <tr>
 * <td>L</td>
 * <td>Three-digit milliseconds (with leading zeroes)</td>
 * <td>047</td>
 * </tr>
 * <tr>
 * <td>N</td>
 * <td>Nine-digit nanoseconds (with leading zeroes)</td>
 * <td>047000000</td>
 * </tr>
 * <tr>
 * <td>P</td>
 * <td>Uppercase morning or afternoon marker</td>
 * <td>PM</td>
 * </tr>
 * <tr>
 * <td>p</td>
 * <td>Lowercase morning or afternoon marker</td>
 * <td>pm</td>
 * </tr>
 * <tr>
 * <td>z</td>
 * <td>RFC 822 numeric offset from GMT</td>
 * <td>-0800</td>
 * </tr>
 * <tr>
 * <td>Z</td>
 * <td>Time zone</td>
 * <td>PST</td>
 * </tr>
 * <tr>
 * <td>s</td>
 * <td>Seconds since 1970-01-01 00:00:00 GMT</td>
 * <td>1078884319</td>
 * </tr>
 * <tr>
 * <td>Q</td>
 * <td>Milliseconds since 1970-01-01 00:00:00 GMT</td>
 * <td>1078884319047</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 */
package tutorialspoint.dateandtime;