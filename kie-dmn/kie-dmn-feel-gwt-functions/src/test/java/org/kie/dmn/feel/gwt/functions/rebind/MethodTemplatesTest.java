package org.kie.dmn.feel.gwt.functions.rebind;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodTemplatesTest {

    @Test
    public void testTemplate() {

        assertEquals("public List<FunctionOverrideVariation> getDefinitions() {\n" +
                             "    ArrayList definitions = new ArrayList();\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE, \"date\", new Parameter( \"year\", BuiltInType.UNKNOWN ), new Parameter( \"month\", BuiltInType.UNKNOWN ), new Parameter( \"day\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE, \"date\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE, \"date\", new Parameter( \"from\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.TIME, \"time\", new Parameter( \"from\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.TIME, \"time\", new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.TIME, \"time\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.TIME, \"time\", new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ), new Parameter( \"offset\", BuiltInType.DURATION ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE_TIME, \"date and time\", new Parameter( \"year\", BuiltInType.UNKNOWN ), new Parameter( \"month\", BuiltInType.UNKNOWN ), new Parameter( \"day\", BuiltInType.UNKNOWN ), new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ), new Parameter( \"hour offset\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE_TIME, \"date and time\", new Parameter( \"year\", BuiltInType.UNKNOWN ), new Parameter( \"month\", BuiltInType.UNKNOWN ), new Parameter( \"day\", BuiltInType.UNKNOWN ), new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ), new Parameter( \"timezone\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE_TIME, \"date and time\", new Parameter( \"date\", BuiltInType.UNKNOWN ), new Parameter( \"time\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE_TIME, \"date and time\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DATE_TIME, \"date and time\", new Parameter( \"year\", BuiltInType.UNKNOWN ), new Parameter( \"month\", BuiltInType.UNKNOWN ), new Parameter( \"day\", BuiltInType.UNKNOWN ), new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DURATION, \"duration\", new Parameter( \"from\", BuiltInType.DURATION ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DURATION, \"duration\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DURATION, \"years and months duration\", new Parameter( \"from\", BuiltInType.UNKNOWN ), new Parameter( \"to\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"string\", new Parameter( \"from\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"string\", new Parameter( \"mask\", BuiltInType.STRING ), new Parameter( \"p\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"number\", new Parameter( \"from\", BuiltInType.STRING ), new Parameter( \"grouping separator\", BuiltInType.STRING ), new Parameter( \"decimal separator\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"substring\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"start position\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"substring\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"start position\", BuiltInType.UNKNOWN ), new Parameter( \"length\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"substring before\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"match\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"substring after\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"match\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"string length\", new Parameter( \"string\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"upper case\", new Parameter( \"string\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"lower case\", new Parameter( \"string\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"contains\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"match\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"starts with\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"match\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"ends with\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"match\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"matches\", new Parameter( \"input\", BuiltInType.STRING ), new Parameter( \"pattern\", BuiltInType.STRING ), new Parameter( \"flags\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"matches\", new Parameter( \"input\", BuiltInType.STRING ), new Parameter( \"pattern\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"replace\", new Parameter( \"input\", BuiltInType.STRING ), new Parameter( \"pattern\", BuiltInType.STRING ), new Parameter( \"replacement\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"replace\", new Parameter( \"input\", BuiltInType.STRING ), new Parameter( \"pattern\", BuiltInType.STRING ), new Parameter( \"replacement\", BuiltInType.STRING ), new Parameter( \"flags\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"list contains\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"element\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"count\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"count\", new Parameter( \"c\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"min\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"min\", new Parameter( \"c\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"max\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"max\", new Parameter( \"c\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"sum\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"sum\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"sum\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"mean\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"mean\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"mean\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"sublist\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"start position\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"sublist\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"start position\", BuiltInType.NUMBER ), new Parameter( \"length\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"append\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"item\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"append\", new Parameter( \"list\", BuiltInType.UNKNOWN ), new Parameter( \"item\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"concatenate\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"insert before\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"position\", BuiltInType.NUMBER ), new Parameter( \"newItem\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"remove\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"position\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"reverse\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"index of\", new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"match\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"union\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"distinct values\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"flatten\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"decimal\", new Parameter( \"n\", BuiltInType.NUMBER ), new Parameter( \"scale\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"floor\", new Parameter( \"n\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"ceiling\", new Parameter( \"n\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"decision table\", new Parameter( \"ctx\", BuiltInType.UNKNOWN ), new Parameter( \"outputs\", BuiltInType.UNKNOWN ), new Parameter( \"input expression list\", BuiltInType.UNKNOWN ), new Parameter( \"input values list\", BuiltInType.LIST ), new Parameter( \"output values\", BuiltInType.UNKNOWN ), new Parameter( \"rule list\", BuiltInType.LIST ), new Parameter( \"hit policy\", BuiltInType.STRING ), new Parameter( \"default output value\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"not\", new Parameter( \"negand\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"sort\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"sort\", new Parameter( \"ctx\", BuiltInType.UNKNOWN ), new Parameter( \"list\", BuiltInType.LIST ), new Parameter( \"precedes\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"get entries\", new Parameter( \"m\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"get value\", new Parameter( \"m\", BuiltInType.UNKNOWN ), new Parameter( \"key\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"all\", new Parameter( \"b\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"all\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"all\", new Parameter( \"list\", BuiltInType.BOOLEAN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"any\", new Parameter( \"b\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"any\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"any\", new Parameter( \"list\", BuiltInType.BOOLEAN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DURATION, \"abs\", new Parameter( \"n\", BuiltInType.DURATION ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"abs\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"abs\", new Parameter( \"n\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"abs\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"modulo\", new Parameter( \"dividend\", BuiltInType.NUMBER ), new Parameter( \"divisor\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"product\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"product\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"product\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"split\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"delimiter\", BuiltInType.STRING ), new Parameter( \"flags\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"split\", new Parameter( \"string\", BuiltInType.STRING ), new Parameter( \"delimiter\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"stddev\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"stddev\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"stddev\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"mode\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"mode\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"sqrt\", new Parameter( \"number\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"log\", new Parameter( \"number\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"exp\", new Parameter( \"number\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"even\", new Parameter( \"number\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"odd\", new Parameter( \"number\", BuiltInType.NUMBER ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"median\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"median\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"day of week\", new Parameter( \"date\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"day of year\", new Parameter( \"date\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"month of year\", new Parameter( \"date\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"week of year\", new Parameter( \"date\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"is\", new Parameter( \"value1\", BuiltInType.UNKNOWN ), new Parameter( \"value2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"after\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"after\", new Parameter( \"point\", BuiltInType.UNKNOWN ), new Parameter( \"range\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"after\", new Parameter( \"point1\", BuiltInType.UNKNOWN ), new Parameter( \"point2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"after\", new Parameter( \"range\", BuiltInType.UNKNOWN ), new Parameter( \"point\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"before\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"before\", new Parameter( \"point\", BuiltInType.UNKNOWN ), new Parameter( \"range\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"before\", new Parameter( \"point1\", BuiltInType.UNKNOWN ), new Parameter( \"point2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"before\", new Parameter( \"range\", BuiltInType.UNKNOWN ), new Parameter( \"point\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"coincides\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"coincides\", new Parameter( \"point1\", BuiltInType.UNKNOWN ), new Parameter( \"point2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"starts\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"starts\", new Parameter( \"point\", BuiltInType.UNKNOWN ), new Parameter( \"range\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"started by\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"started by\", new Parameter( \"range\", BuiltInType.UNKNOWN ), new Parameter( \"point\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"finishes\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"finishes\", new Parameter( \"point\", BuiltInType.UNKNOWN ), new Parameter( \"range\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"finished by\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"finished by\", new Parameter( \"range\", BuiltInType.UNKNOWN ), new Parameter( \"point\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"during\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"during\", new Parameter( \"point\", BuiltInType.UNKNOWN ), new Parameter( \"range\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"includes\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"includes\", new Parameter( \"range\", BuiltInType.UNKNOWN ), new Parameter( \"point\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"overlaps\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"overlaps before\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"overlaps after\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"meets\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"met by\", new Parameter( \"range1\", BuiltInType.UNKNOWN ), new Parameter( \"range2\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"time\", new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ), new Parameter( \"offset\", BuiltInType.DURATION ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"time\", new Parameter( \"hour\", BuiltInType.UNKNOWN ), new Parameter( \"minute\", BuiltInType.UNKNOWN ), new Parameter( \"second\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"time\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"time\", new Parameter( \"from\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"date\", new Parameter( \"year\", BuiltInType.UNKNOWN ), new Parameter( \"month\", BuiltInType.UNKNOWN ), new Parameter( \"day\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"date\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"date\", new Parameter( \"from\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DURATION, \"duration\", new Parameter( \"from\", BuiltInType.DURATION ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.DURATION, \"duration\", new Parameter( \"from\", BuiltInType.STRING ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"now\" ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"today\" ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.STRING, \"code\", new Parameter( \"value\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"invoke\", new Parameter( \"ctx\", BuiltInType.UNKNOWN ), new Parameter( \"namespace\", BuiltInType.STRING ), new Parameter( \"model name\", BuiltInType.STRING ), new Parameter( \"decision name\", BuiltInType.STRING ), new Parameter( \"parameters\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"nn any\", new Parameter( \"list\", BuiltInType.BOOLEAN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"nn any\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"nn any\", new Parameter( \"b\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"nn all\", new Parameter( \"list\", BuiltInType.BOOLEAN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"nn all\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.BOOLEAN, \"nn all\", new Parameter( \"b\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn count\", new Parameter( \"c\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn count\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"nn max\", new Parameter( \"c\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"nn max\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn mean\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn mean\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn mean\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn median\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn median\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"nn min\", new Parameter( \"c\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.UNKNOWN, \"nn min\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"nn mode\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.LIST, \"nn mode\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn stddev\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn stddev\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn stddev\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn sum\", new Parameter( \"list\", BuiltInType.UNKNOWN ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn sum\", new Parameter( \"list\", BuiltInType.LIST ) ) );\n" +
                             "definitions.add( new FunctionOverrideVariation( BuiltInType.NUMBER, \"nn sum\", new Parameter( \"n\", BuiltInType.UNKNOWN ) ) );\n" +
                             "return definitions;\n" +
                             "}",
                     MethodTemplates.getTemplate());
    }
}