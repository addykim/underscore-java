/*
 * The MIT License (MIT)
 *
 * Copyright 2015 Valentyn Kolesnikov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.underscore.string;

import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Underscore library unit test.
 *
 * @author Valentyn Kolesnikov
 */
public class StringTest {

/*
_.camelCase('Foo Bar');
=> 'fooBar'

_.camelCase('--foo-bar');
=> 'fooBar'

_.camelCase('__foo_bar__');
=> 'fooBar'
*/

    @Test
    public void camelCase() {
        assertEquals("fooBar", $.camelCase("Foo Bar"));
        assertEquals("fooBar", new $("Foo Bar").camelCase());
        assertEquals("fooBar", $.chain("Foo Bar").camelCase().item());
        assertEquals("fooBar", $.camelCase("--foo-bar"));
        assertEquals("fooBar", $.camelCase("__foo_bar__"));
        assertEquals("", $.camelCase(null));
        assertEquals("a", $.camelCase("\u00c0"));
    }

/*
_.capitalize('fred');
 => 'Fred'
*/
    @Test
    public void capitalize() {
        assertEquals("Fred", $.capitalize("fred"));
        assertEquals("Fred", new $("fred").capitalize());
        assertEquals("Fred", $.chain("fred").capitalize().item());
        assertEquals("", $.capitalize(null));
        assertEquals("À", $.capitalize("\u00c0"));
    }

    @Test
    public void main() throws Exception {
        $.main(new String[] {});
        new $(new ArrayList<String>());
        new $("");
        $.chain(new ArrayList<String>());
        $.chain(new HashSet<String>());
        $.chain(new String[] {});
    }
}
