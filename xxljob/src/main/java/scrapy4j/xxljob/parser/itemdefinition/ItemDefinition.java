package scrapy4j.xxljob.parser.itemdefinition;


import scrapy4j.core.item.Item;
import scrapy4j.core.pojo.Response;

import java.util.List;

public interface ItemDefinition {
    List<Item> extractAndTransformItems(Response response);
}
