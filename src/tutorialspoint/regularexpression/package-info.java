/**
 * Contains some examples about Regular Expression topic.
 *
 * <head> <link rel="stylesheet" type="text/css" href="../../../files/mystyle.css"> </head>
 * <p>
 * <table>
 * <caption>Regular Expression Metacharacter Syntax</caption> <tbody>
 * <tr>
 * <th>Subexpression</th>
 * <th>Matches</th>
 * </tr>
 * <tr>
 * <td>^</td>
 * <td>Matches beginning of line.</td>
 * </tr>
 * <tr>
 * <td>$</td>
 * <td>Matches end of line.</td>
 * </tr>
 * <tr>
 * <td>.</td>
 * <td>Matches any single character except newline. Using m option allows it to match newline as
 * well.</td>
 * </tr>
 * <tr>
 * <td>[...]</td>
 * <td>Matches any single character in brackets.</td>
 * </tr>
 * <tr>
 * <td>[^...]</td>
 * <td>Matches any single character not in brackets</td>
 * </tr>
 * <tr>
 * <td>\A</td>
 * <td>Beginning of entire string</td>
 * </tr>
 * <tr>
 * <td>\z</td>
 * <td>End of entire string</td>
 * </tr>
 * <tr>
 * <td>\Z</td>
 * <td>End of entire string except allowable final line terminator.</td>
 * </tr>
 * <tr>
 * <td>re*</td>
 * <td>Matches 0 or more occurrences of preceding expression.</td>
 * </tr>
 * <tr>
 * <td>re+</td>
 * <td>Matches 1 or more of the previous thing</td>
 * </tr>
 * <tr>
 * <td>re?</td>
 * <td>Matches 0 or 1 occurrence of preceding expression.</td>
 * </tr>
 * <tr>
 * <td>re{ n}</td>
 * <td>Matches exactly n number of occurrences of preceding expression.</td>
 * </tr>
 * <tr>
 * <td>re{ n,}</td>
 * <td>Matches n or more occurrences of preceding expression.</td>
 * </tr>
 * <tr>
 * <td>re{ n, m}</td>
 * <td>Matches at least n and at most m occurrences of preceding expression.</td>
 * </tr>
 * <tr>
 * <td>a| b</td>
 * <td>Matches either a or b.</td>
 * </tr>
 * <tr>
 * <td>(re)</td>
 * <td>Groups regular expressions and remembers matched text.</td>
 * </tr>
 * <tr>
 * <td>(?: re)</td>
 * <td>Groups regular expressions without remembering matched text.</td>
 * </tr>
 * <tr>
 * <td>(?&gt; re)</td>
 * <td>Matches independent pattern without backtracking.</td>
 * </tr>
 * <tr>
 * <td>\w</td>
 * <td>Matches word characters.</td>
 * </tr>
 * <tr>
 * <td>\W</td>
 * <td>Matches nonword characters.</td>
 * </tr>
 * <tr>
 * <td>\s</td>
 * <td>Matches whitespace. Equivalent to [\t\n\r\f].</td>
 * </tr>
 * <tr>
 * <td>\S</td>
 * <td>Matches nonwhitespace.</td>
 * </tr>
 * <tr>
 * <td>\d</td>
 * <td>Matches digits. Equivalent to [0-9].</td>
 * </tr>
 * <tr>
 * <td>\D</td>
 * <td>Matches nondigits.</td>
 * </tr>
 * <tr>
 * <td>\A</td>
 * <td>Matches beginning of string.</td>
 * </tr>
 * <tr>
 * <td>\Z</td>
 * <td>Matches end of string. If a newline exists, it matches just before newline.</td>
 * </tr>
 * <tr>
 * <td>\z</td>
 * <td>Matches end of string.</td>
 * </tr>
 * <tr>
 * <td>\G</td>
 * <td>Matches point where last match finished.</td>
 * </tr>
 * <tr>
 * <td>\n</td>
 * <td>Back-reference to capture group number "n"</td>
 * </tr>
 * <tr>
 * <td>\b</td>
 * <td>Matches word boundaries when outside brackets. Matches backspace (0x08) when inside brackets.
 * </td>
 * </tr>
 * <tr>
 * <td>\B</td>
 * <td>Matches nonword boundaries.</td>
 * </tr>
 * <tr>
 * <td>\n, \t, etc.</td>
 * <td>Matches newlines, carriage returns, tabs, etc.</td>
 * </tr>
 * <tr>
 * <td>\Q</td>
 * <td>Escape (quote) all characters up to \E</td>
 * </tr>
 * <tr>
 * <td>\E</td>
 * <td>Ends quoting begun with \Q</td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 */
package tutorialspoint.regularexpression;